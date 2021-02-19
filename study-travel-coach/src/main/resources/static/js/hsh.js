$(document).ready(function () {
})

function delete1(a) {
    var json = {
        id: a
    }
    $.post("/luojidelete", json, function () {
        location.href="/gooduserselect";
    })
}
