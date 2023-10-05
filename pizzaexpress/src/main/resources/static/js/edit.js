function DeleteProduct(btnDeleteObj, productId, deleteUrl) {
    //tạo javascript object
    let data = {
        id: productId,
    };
    //$===jQuery
    //json == javascript object
    jQuery.ajax({
        url: deleteUrl,
        type: "delete",
        contentType: "application/json",
        data: JSON.stringify(data),

        dataType: "json",
        success: function(jsonResult) {
            $(btnDeleteObj).closest('.hang').remove();

        },
        error: function(jqXhr, textStatus, errorMessage) {
            alert("error");
        }
    });
}

$(document).ready(function (e) {
    $('.btn-danger').on('click', function () {
        let productId = $(this).attr('data-productId');
        let deleteUrl = $(this).attr('data-deleteUrl');
        DeleteProduct($(this), productId, deleteUrl);
    });
});
