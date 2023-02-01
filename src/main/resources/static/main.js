window.onload = function() {
    $(".like").click((e) => {
                    console.log("111");
        var btn = $(e.currentTarget);
        var postId = btn.attr("data-post-id");
        btn.attr("disabled", "disabled");
                    console.log(postId);
        $.post("/post/" + postId + "/like", (data) => {
            btn.text("" + data + " ❤");
            btn.removeClass("btn-secondary");
            btn.addClass("btn-danger");
                    console.log("333");
        });
    });
};