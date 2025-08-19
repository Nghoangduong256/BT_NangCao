// Toggle class trên body để mở/đóng sidebar
      $("#sbToggle").on("click", function () {
        $("body").toggleClass("sb-open");
        $(this).find("i").toggleClass("fa-bars fa-xmark"); // đổi icon bars <-> X
      });

// Gọi API lấy dữ liệu điền vào bảng
function fillData() {
    $("#data-table").empty();
    // Gọi API để lấy dữ liệu
       $.ajax({
       url: 'https://68a288f2c5a31eb7bb1d1e70.mockapi.io/api/v1/studentClass',
       type: 'GET',
       contentType: 'application/json', // Định nghĩa định dạng dữ liệu truyền vào là json
    //    data: JSON.stringify(request), // Object truyền vào request body (thường dùng cho chức năng thêm mới và chỉnh sửa)
       error: function (err) {
           // Hành động khi apii bị lỗi
           console.log(err)
           alert("Lỗi khi lấy dữ liệu API")
       },
       success: function (data) {
           // Hành động khi thành công
           console.log(data)
           for(let i = 0; i< data.length; i++){
            let row = `<tr>
            <td>${i+1}</td>
            <td><img src="${data[i].avatar}" alt="Avatar" width="50"></td>
            <td>${data[i].fullname}</td>
            <td>${data[i].class}</td>
            <td>${data[i].email}</td>
            <td>${data[i].phoneNumber}</td>
            <td>${data[i].dateOfBirth}</td>
            <td><button class="btn btn-danger" onclick="deleteData(${data[i].id})">Delete</button>
            <button class="btn btn-warning" onclick="editData(${data[i].id}, '${data[i].avatar}', '${data[i].fullname}', '${data[i].class}', '${data[i].email}', '${data[i].phoneNumber}', '${data[i].dateOfBirth}')" data-bs-toggle="modal" data-bs-target="#exampleModal">Edit</button></td>
            `
            
            $("#data-table").append(row)
           }
       }
   });
}

// Gọi API để xóa dữ liệu
function deleteData(id) {
    if (!confirm("Bạn có chắc chắn muốn xóa dữ liệu này?")) {
        return; // Dừng thực hiện nếu người dùng không xác nhận
    }
    $.ajax({
        url: `https://68a288f2c5a31eb7bb1d1e70.mockapi.io/api/v1/studentClass/${id}`,
        type: 'DELETE',
        success: function () {
            alert("Xóa thành công");
            fillData(); // Cập nhật lại bảng dữ liệu
        },
        error: function (err) {
            console.log(err);
            alert("Lỗi khi xóa dữ liệu");
        }
    });
}

// Thêm mới học sinh
function addNewStudent() {
    // Lấy thông tin từ các trường input
    let id = $("#id").val(); // Nếu có trường id
    let avatar = $("#avatar").val();
    let fullname = $("#fullname").val();
    let className = $("#className").val();
    let email = $("#email").val();
    let phoneNumber = $("#phoneNumber").val();
    let dateOfBirth = $("#dateOfBirth").val();

    // Kiểm tra dữ liệu hợp lệ
    if (!fullname || !email || !phoneNumber || !dateOfBirth || !className) {
        alert("Vui lòng điền đầy đủ thông tin");
        return;
    }

    // Phân 2 trường hợp: Tạo mới & Edit 
    if (id) {
        // Edit học sinh có sẵn
        $.ajax({
            url: `https://68a288f2c5a31eb7bb1d1e70.mockapi.io/api/v1/studentClass/${id}`,
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify({
                avatar,
                fullname,
                class: className,
                email,
                phoneNumber,
                dateOfBirth,
            }),
            success: function () {
                alert("Cập nhật thành công");
                fillData(); // Cập nhật lại bảng dữ liệu
            },
            error: function (err) {
                console.log(err);
                alert("Lỗi khi cập nhật dữ liệu");
            }
        });
    } else {
        // Tạo mới
      $.ajax({
          url: 'https://68a288f2c5a31eb7bb1d1e70.mockapi.io/api/v1/studentClass',
          type: 'POST',
          contentType: 'application/json',
          data: JSON.stringify({
              avatar,
              fullname,
              class: className,
              email,
              phoneNumber,
              dateOfBirth,
          }),
          success: function () {
              alert("Thêm mới thành công");
              fillData(); // Cập nhật lại bảng dữ liệu
          },
          error: function (err) {
              console.log(err);
              alert("Lỗi khi thêm mới dữ liệu");
          }
      });
    }
}

// Lấy dữ liệu của học sinh đã có
function editData(id, avatar, fullname, className, email, phoneNumber, dateOfBirth) {
  clearForm();
  console.log("Edit student with ID:", id);
  $("#id").val(id);
  $("#avatar").val(avatar);
  $("#fullname").val(fullname);
  $("#className").val(className);
  $("#email").val(email);
  $("#phoneNumber").val(phoneNumber);
  $("#dateOfBirth").val(dateOfBirth);
}

// Xóa cache lưu thông tin nhập trong modal
function clearForm() {
  $("#id").val("");
  $("#avatar").val("");
  $("#fullname").val("");
  $("#className").val("");
  $("#email").val("");
  $("#phoneNumber").val("");
  $("#dateOfBirth").val("");
}
