$(document).ready(
function () {

    $("#search-form").submit(function (event) {
        fire_ajax_submit();
    });
    
    
    $("#btn-search-all").click(function (event) {       
        btn_find_all();
    });    

});

function btn_find_all() {
    var defaultUrl = "http://localhost:8080";
    $.ajax({
        charset: "UTF-8",
        crossDomain: true,
        type: "GET",
        contentType: "application/json",
        url: "http://localhost:8080/person/preview",
        dataType: 'json',
        timeout: 600000,
        success: function (data) {
           $('#feedback').html(data);

            console.log("SUCCESS : ", data);
            $("#btn-search-all").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search-all").prop("disabled", false);

        }
    });
}

function fire_ajax_submit() {

    var defaultUrl = "http://localhost:8080"
    var id = $("#username").val()

    $("#btn-search").prop("disabled", true);

    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: "http://localhost:8080/person/preview/" + id,
        // data: JSON.stringify(search),
        dataType: 'json',
        timeout: 600000,
        success: function (data) {
            $('#feedback').html(data.val());
            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);
        },
        error: function (e) {
            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}
