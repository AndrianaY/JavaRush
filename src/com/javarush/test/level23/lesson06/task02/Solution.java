package com.javarush.test.level23.lesson06.task02;

/* Рефакторинг
Отрефакторите класс Solution: вынесите все константы в public вложенный(nested) класс Constants.
Запретите наследоваться от Constants.
*/
public class Solution {

    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super(Constants.serverNotAccessibleMessage);
        }

        public ServerNotAccessibleException(Throwable cause) {
            super(Constants.serverNotAccessibleMessage, cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super(Constants.unauthorizedUserMessage);
        }

        public UnauthorizedUserException(Throwable cause) {
            super(Constants.unauthorizedUserMessage, cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super(Constants.bannedUserMessage);
        }

        public BannedUserException(Throwable cause) {
            super(Constants.bannedUserMessage, cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super(Constants.restrictionMessage);
        }

        public RestrictionException(Throwable cause) {
            super(Constants.restrictionMessage, cause);
        }
    }

    public final static class Constants{
        public final static String serverNotAccessibleMessage = "Server is not accessible for now.";
        public final static String unauthorizedUserMessage = "User is not authorized.";
        public final static String bannedUserMessage = "User is banned.";
        public final static String restrictionMessage = "Access is denied.";

    }
}
