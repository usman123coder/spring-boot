<html>
	<head></head>
	<body>
		<h2>Book Details</h2>
		<form action="book">
			Book Id : <input type="text" value="id" placeholder="Enter Id"/>
			<br>
			<input type="submit" value="Search"/>
		</form >
		<hr/>
		Book Id : ${book.id} <br>
		Book Name : ${book.bookName} <br>
		Book Price : ${book.price}
	</body>
</html>