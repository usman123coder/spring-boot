<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Details</title>
    <style>
        /* Styling the body */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f4f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100%;
            color: #333;
        }

        /* Heading style */
        #heading {
            background-color: #00bcd4;
            padding: 20px;
            border-radius: 10px;
            text-align: center;
            color: white;
            font-size: 28px;
            margin-bottom: 20px;
        }

        /* Form styling */
        form {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #00bcd4;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            /* cursor: pointer; */
            font-size: 16px;
        }

        /* input[type="submit"]:hover {
            background-color: #0097a7;
        } */

        /* Styling the result section */
        #result {
            width: 100%;
            max-width: 800px;
            border: 2px solid #00bcd4;
            padding: 20px;
            margin-top: 20px;
            border-radius: 10px;
            background-color: white;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            display: none; /* Hidden initially, can be shown when data is available */
        }

        /* Styling individual book details */
        /* .book-detail {
            font-size: 18px;
            margin: 10px 0;
        } */

        /* Centering container */
        /* .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        } */
/*  */
        /* Adding responsive design */
        /* @media (max-width: 768px) {
            form {
                width: 100%;
                padding: 15px;
            }
            #result {
                width: 100%;
                padding: 15px;
            }
        } */
    </style>
</head>
<body>

    <div class="container">
        <!-- Heading -->
        <h2 id="heading">Book Details</h2>

        <!-- Search Form -->
        <form action="book" method="GET">
            <label for="id">Enter Book ID:</label><br>
            <input type="text" name="id" id="id" placeholder="Enter Book ID" required/><br>
            <input type="submit" value="Search">
        </form>
<br><br>
        <!-- Result Section (This will display book details) -->
        <div id="result">
            <div class="book-detail">Book ID: <strong>${book.id}</strong></div>
            <div class="book-detail">Book Name: <strong>${book.bookName}</strong></div>
            <div class="book-detail">Book Price: <strong>${book.price}</strong></div>
        </div>
    </div>

</body>
</html>
