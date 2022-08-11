
  function operateFormatter(value, row, index) {
    return [
      '<a class="like" href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="User Posts" data-bs-toggle="modal" data-bs-target="#exampleModal">',
      '<i class="bi bi-chat-dots"></i>',
      '</a>'
    ].join('')
  }

  window.operateEvents = {
    'click .like': function (e, value, row, index) {
        $.ajax({
            contentType: 'application/json; charset=utf-8',
            dataType: 'json',
            type: 'Get',
            url: '/users/'+row.id+'/posts',
            success: function (data) {
                $('#postsTable').bootstrapTable({})
                $('#postsTable').bootstrapTable('load', data);
                $('#postsTable').bootstrapTable('resetView');
            },
            error: function (e) {
                console.log(e);
            }
        });
    },
  }