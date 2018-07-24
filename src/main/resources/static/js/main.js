/**
*
*/

$(document).ready(function(){
    $('.nBtn, .table .eBtn').on('click', function(event){

        event.preventDefault();//wont send request to sender
        var href = $(this).attr('href');
        var text = $(this).text();

        if (text == 'Edit') {
            $.get(href, function(country, status){
                $('.myForm #id').val(country.id);
                $('.myForm #name').val(country.name);
                $('.myForm #capitol').val(country.capitol);
            });
        } else {
            $('.myForm #id').val('');
            $('.myForm #name').val('');
            $('.myForm #capitol').val('');
        }
        $('.myForm #exampleModal').modal();
    });

    $('.table .delBtn').on('click', function(event) {
        event.preventDefault();//wont send request to sender
        var href = $(this).attr('href');
        $('#deleteModal #delRef').attr('href', href);
        $('#deleteModal').modal();
    });
});