package controller;

import javax.servlet.http.HttpServletRequest;

class CmdProfile extends Cmd{
    @Override
    Action execute(HttpServletRequest req) throws SiteException {
        if (!Util.checkClient(req))
            return Action.LOGIN;


        if(req.getSession().getAttribute("admin")!=null){
            return Action.ADMINPROFILE;
        }


        return Action.PROFILE;
    }
}
