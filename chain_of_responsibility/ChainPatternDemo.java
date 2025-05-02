public class ChainPatternDemo {
    
    private static AbstractLogger getChainOfLoggers () {
        AbstractLogger erroLogger = new ErrorLogger(AbstractLogger.ERROR) ;
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG) ;
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO) ;
        
        erroLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return erroLogger ;
    }


    public static void main (String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers() ;

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.") ;
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.") ;
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.") ;
    }
}
