<?php

require('db-connect.php');

$name = $_POST['name'];
$type = $_POST['type'];

$sql = "INSERT INTO trees (type, name) VALUES ('$name', '$type')";

echo $sql;

$result = $conn->query($sql);

if ($result === TRUE) {
    echo "Baum erfolgreich erfasst";
} else {
    echo "Es ist ein Fehler aufgetreten: " . $conn->error;
}
