package com.xmvp.cn.bean;

import java.util.List;

/**
 * @author 张海洋
 * @Date on 2018/07/02.
 * @org 上海相舆科技有限公司
 * @describe
 */

public class LoginBean {


    /**
     * code : 1
     * msg : 登录成功
     * time : 1546570166
     * data : [{"id":9,"username":"13681929794","nickname":"周观金","avatar":"/assets/img/avatar.png","department_id":2,"position_id":4,"token":"fde27e73-a9a1-43ce-a01e-3cda372bbe4f","expires_in":7200,"wifissid":"Shanutec_2G","wifipwd":"shanutec8888","cid":1,"manage_department_id":2}]
     */

    private int code;
    private String msg;
    private String time;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 9
         * username : 13681929794
         * nickname : 周观金
         * avatar : /assets/img/avatar.png
         * department_id : 2
         * position_id : 4
         * token : fde27e73-a9a1-43ce-a01e-3cda372bbe4f
         * expires_in : 7200
         * wifissid : Shanutec_2G
         * wifipwd : shanutec8888
         * cid : 1
         * manage_department_id : 2
         */

        private int id;
        private String username;
        private String nickname;
        private String avatar;
        private int department_id;
        private int position_id;
        private String token;
        private int expires_in;
        private String wifissid;
        private String wifipwd;
        private int cid;
        private int manage_department_id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getDepartment_id() {
            return department_id;
        }

        public void setDepartment_id(int department_id) {
            this.department_id = department_id;
        }

        public int getPosition_id() {
            return position_id;
        }

        public void setPosition_id(int position_id) {
            this.position_id = position_id;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getExpires_in() {
            return expires_in;
        }

        public void setExpires_in(int expires_in) {
            this.expires_in = expires_in;
        }

        public String getWifissid() {
            return wifissid;
        }

        public void setWifissid(String wifissid) {
            this.wifissid = wifissid;
        }

        public String getWifipwd() {
            return wifipwd;
        }

        public void setWifipwd(String wifipwd) {
            this.wifipwd = wifipwd;
        }

        public int getCid() {
            return cid;
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

        public int getManage_department_id() {
            return manage_department_id;
        }

        public void setManage_department_id(int manage_department_id) {
            this.manage_department_id = manage_department_id;
        }
    }
}
