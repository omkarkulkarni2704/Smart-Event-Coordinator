$(document).ready(function() {
    $('#eventForm').on('submit', function(e) {
        e.preventDefault();
        
        const event = {
            name: $('#name').val(),
            description: $('#description').val(),
            startTime: $('#startTime').val(),
            endTime: $('#endTime').val()
        };

        $.ajax({
            url: '/events',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(event),
            success: function(response) {
                alert('Event created successfully');
                loadEvents();
            },
            error: function(error) {
                console.error('Error:', error);
            }
        });
    });

    function loadEvents() {
        $.ajax({
            url: '/events',
            method: 'GET',
            success: function(response) {
                $('#eventsList').empty();
                response.forEach(event => {
                    $('#eventsList').append(`<p>${event.name} - ${event.description} - ${event.startTime} to ${event.endTime}</p>`);
                });
           
