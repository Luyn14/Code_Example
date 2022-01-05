<?php
session_start();
if (isset($_SESSION['loggedIn']) && $_SESSION['loggedIn']) {
    header('Location: intern.php');
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Index</title>
</head>

<body>
    <form method="POST" action="login.php">
        <h1 class="text-center"> Login </h1>
        <div class="container">
            <div class="mb-3">
                <label for="username" class="form-label">Username</label>
                <input type="username" class="form-control" id="username" name="username">
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password">
            </div>
            <?php
            if (isset($_SESSION['loginFailed'])) {
                echo '<div class="mb-3"><span class="fw-bold text-danger">' . $_SESSION['loginFailed'] . '</span></div>';
                $_SESSION['loginFailed'] = null;
            }
            ?>
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>

</body>

</html>