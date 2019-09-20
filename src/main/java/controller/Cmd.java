package controller;

import javax.servlet.http.HttpServletRequest;

abstract class Cmd {

    abstract Action execute(HttpServletRequest req) throws Exception;

    @Override
    public String toString() {
        String simpleName = this.getClass().getSimpleName();
        String cmd = simpleName.replaceFirst("Cmd", "");
        return cmd.toLowerCase();
    }
}
