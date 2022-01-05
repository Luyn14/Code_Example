<?php

require('db-connect.php');

$id = 0;

if (!empty($_GET)) {

    $id = $_GET['id'];

    $sql = "SELECT * FROM trees WHERE id = $id";

    $result = $conn->query($sql);

    $row = $result->fetch_assoc();
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Edit Tree</title>
</head>

<body>
    <h3 class="text-center"> Baum erfassen </h3>
    <form method="POST" action="save-tree.php">
        <input type="hidden" name="id" value="<?php echo $id ?>">
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" aria-describedby="emailHelp" name="name" value=<?php if (isset($row)) {
                                                                                                                    echo $row['name'];
                                                                                                                } ?>>
        </div>
        <div class="mb-3">
            <label for="vorname" class="form-label">Vorname</label>
            <input type="text" class="form-control" id="vorname" name="type" value=<?php if (isset($row)) {
                                                                                        echo $row['type'];
                                                                                    } ?>>
        </div>
        <button type=" submit" name="submit" class="btn btn-primary">Submit</button>
    </form>

</body>