<?php

require('db-connect.php');

//echo "judihui";

$sql = "SELECT * FROM trees";
$result = $conn->query($sql);

if ($result->num_rows == 0) {
    echo "0 results";
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>PHP verbinden zu SQL</title>
</head>

<body>

    <div class="container">
        <h1 class="text-center"> Trees DB</h1>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">name</th>
                    <th scope="col">Type</th>
                </tr>
            </thead>
            <tbody>
                <?php
                while ($row = $result->fetch_assoc()) {

                ?>

                    <tr>
                        <th scope="row"><?php echo $row['id'] ?></th>
                        <td><?php echo $row['name'] ?></td>
                        <td><?php echo $row['type'] ?></td>
                        <td><a href="edit-tree.php?id=<?php echo $row['id']; ?>"" class= " btn btn-secondary">Bearbeiten</a>
                    </tr>

                <?php

                }

                ?>
            </tbody>
        </table>
        <a href="edit-tree.php" class="btn btn-primary">Baum erfassen</a>
    </div>

</body>

</html>