<?php
include connect.php
$car_num = $_Post["car_num"];
$sql = "SELECT Make, Model, Year FROM car_data WHERE".$car_num." = car_num";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
		while($row = $result->fetch_assoc()) {
			$car["Make"] = $row["Make"];
			$car["Model"] = $row["Model"];
			$car["Year"] = $row["Year"];
		}
}
echo json_encode($car);
include closeDB.php
?>