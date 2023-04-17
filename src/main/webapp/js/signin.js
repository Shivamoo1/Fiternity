let container = document.getElementById('container')

toggle = () => {
	container.classList.toggle('sign-in')
	container.classList.toggle('sign-up')
}

setTimeout(() => {
	container.classList.add('sign-in')
}, 200)

// Get the modal and the button that opens it
var modal = document.querySelector('.modal-content');
var buttons = document.querySelectorAll('button');

// Add a click event listener to each button
for (var i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener('click', function() {
        // Toggle the "show" class on the modal content
        modal.classList.toggle('show');
    });
}