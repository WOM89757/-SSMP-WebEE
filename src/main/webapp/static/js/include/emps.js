//显示员工数据
function build_user_table(result) {
    //先清空table表格
    $("#users_table tbody").empty();
    var users = result.extend.pageInfo.list;
    $.each(users, function (index, item) {
        var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
        var empIdTd = $("<td></td>").append(item.userId);
        var empNameTd = $("<td></td>").append(item.userName);
        var genderTd = $("<td></td>").append(item.gender == "M" ? "男" : "女");
        var emailTd = $("<td></td>").append(item.sysRole.roleName);
       // var deptNameTd = $("<td></td>").append(item.department.deptName);
        var schoolNameTd = $("<td></td>").append(item.sysSchool.schoolName);
        var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
            .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
        // 为编辑按钮添加自定义的属性，来表示当前员工的id
        editBtn.attr("edit-id", item.userId);

        var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
            .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
        delBtn.attr("del-id", item.userId);

        var btnTd = $("<td></td>").append(editBtn).append("   ").append(delBtn);
        $("<tr></tr>").append(checkBoxTd).append(empIdTd).append(empNameTd)
            .append(genderTd).append(emailTd)
            // .append(deptNameTd)
            .append(schoolNameTd)
            .append(btnTd).appendTo("#users_table tbody");
    });
}


