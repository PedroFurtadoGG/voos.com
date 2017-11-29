//Step-1
var mysql = require('mysql');
//Step-2
var conn = mysql.createConnection({

host : "localhost",
user : "root",
password : "",
database : "voos"
}
);

//Step-3 -- create connection from Pool

var queryString = "Select * from avioes";
conn.query(queryString, function (error,results)
{
if(error)
{
throw error;
}
else {
console.log(results);
}
}
)