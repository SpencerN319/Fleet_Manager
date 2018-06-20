<?php
include connect.php
$car_num = $_Post["car_num"];
$sql = "SELECT Make, Model, Year FROM car_data WHERE".$car_num." = car_num";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
		while($row = $result->fetch_assoc()) {
			$car["make"] = $row["make"];
			$car["model"] = $row["model"];
			$car["year"] = $row["year"];
		}
}
echo json_encode($car);
include closeDB.php
?>