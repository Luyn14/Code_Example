<?php

$servername = "localhost";
$username = "root";
$passwort = "";
$dbname = "PHP-DB";

$conn = new mysqli($servername, $username, $passwort, $dbname);

if ($conn->connect_error) {
    die("connection failed" . $conn->connect_error);
}
