<?php

require('db-connect.php');

$id = $_POST['id'];
$name = $_POST['name'];
$type = $_POST['type'];

if ($id > 0) {
    $sql = "UPDATE trees SET name = '$name', type = '$type' WHERE id = $id";
} else {
    $sql = "INSERT INTO trees (type, name) VALUES ('$type', '$name')";
}


$result = $conn->query($sql);

if ($result) {
    header('Location: index.php');
} else {
    echo "Es ist ein Fehler aufgetreten: " . $conn->error;
}
