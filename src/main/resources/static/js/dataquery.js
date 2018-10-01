$(document).ready( function () {
    var table = $('#postTable').DataTable({
        "sAjaxSource": "/all",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        columns: [
            { "mData": "id"},
            { "mData": "title" },
            { "mData": "content" },
        ]
    })
});