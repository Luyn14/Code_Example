<?php
require('db-connect.php');

if (empty($_POST)) {
    header('Location: index.php');
}

class LoginController
{

    function login(string $username, string $password): bool
    {
        global $conn;
        $result = $conn->query("SELECT * FROM user WHERE username = '$username' AND password = '$password'");

        if ($result->num_rows == 1) {
            return true;
        } else {
            return false;
        }
    }
}


session_start();

$username = $_POST['username'];
$password = $_POST['password'];

$controller = new LoginController();

if ($controller->login($username, $password)) {
    $_SESSION['loggedIn'] = true;

    header('Location: intern.php');
} else {
    $_SESSION['loginFailed'] = "Benutzername/Passwort falsch";

    header('Location: index.php');
}
