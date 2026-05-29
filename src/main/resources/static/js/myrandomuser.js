var users = [];
var currentIndex = 0;

function loadUsers() {
    fetch("/api/users")
        .then(function(response) {
            return response.json();
        })
        .then(function(data) {
            users = data;
            displayUser();
        });
}

function displayUser() {
    var user = users[currentIndex];

    document.getElementById("name").innerHTML = user.name;
    document.getElementById("gender").innerHTML = user.gender;
    document.getElementById("image").src = user.image;
}

function nextRandomUser() {
    currentIndex++;

    if (currentIndex >= users.length) {
        currentIndex = 0;
    }

    displayUser();
}

loadUsers();