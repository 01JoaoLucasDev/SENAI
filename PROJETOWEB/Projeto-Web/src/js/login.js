document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('loginForm');
    const emailInput = document.getElementById('email');
    const passwordInput = document.getElementById('password');
    const submitButton = document.getElementById('submitButton');

    loginForm.addEventListener('submit', function(event) {
        event.preventDefault();
        const email = emailInput.value.trim();
        const password = passwordInput.value.trim();

        if (validateForm(email, password)) {
            // Here you would typically send the login data to the server
            console.log('Logging in with:', { email, password });
            // Redirect or show success message
        } else {
            alert('Please enter valid email and password.');
        }
    });

    function validateForm(email, password) {
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailPattern.test(email) && password.length > 0;
    }
});