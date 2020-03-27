<%@ page contentType="text/html;charset=UTF-8" %>
<%--添加员工模态框--%>
<div class="modal fade" id="userAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">添加用户</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" >
                    <div class="form-group">
                        <label class="col-sm-3 control-label">姓名</label>
                        <div class="col-sm-9">
                            <input type="text" name="userName" class="form-control" id="empName_add_input" placeholder="姓名">
                            <span class="help-block"></span>
                        </div>
                    </div>
<%--                    <div class="form-group">--%>
<%--                        <label class="col-sm-3 control-label">邮箱</label>--%>
<%--                        <div class="col-sm-9">--%>
<%--                            <input type="text" name="email" class="form-control" id="email_add_input" placeholder="email@gmail.com">--%>
<%--                            <span class="help-block"></span>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label class="col-sm-3 control-label">性别</label>--%>
<%--                        <div class="col-sm-6">--%>
<%--                            <label class="radio-inline">--%>
<%--                                <input type="radio" name="gender" id="gender1_add_input" value="M" checked="checked"> 男--%>
<%--                            </label>--%>
<%--                            <label class="radio-inline">--%>
<%--                                <input type="radio" name="gender" id="gender2_add_input" value="F"> 女--%>
<%--                            </label>--%>
<%--                        </div>--%>
<%--                    </div>--%>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">状态</label>
                        <div class="col-sm-9">
                            <%--部门信息 提交部门id即可--%>
                            <select class="form-control" name="userStatus" id="user_status_select">
                                <option value="可用">可用</option>
                                <option value="禁用">禁用</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">学校</label>
                        <div class="col-sm-9">
                            <%--部门信息 提交部门id即可--%>
                            <select class="form-control" name="schoolId" id="dept_add_select"></select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="user_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>
