package controller;

import javax.servlet.http.HttpServletRequest;

class CmdLogout extends Cmd{
    @Override
    Action execute(HttpServletRequest req) throws SiteException {
//        if (Form.isPost(req)){
//            if (Form.getString(req,"logout")!=null){
                req.getSession().invalidate();
                return Action.LOGIN;
//            }
//        }
//
//        return Action.LOGOUT;
    }
}
