<?php
include connect.php
$car_num = $_Post["car_num"];
$sql = "SELECT Day, Gallons_used FROM gas_info WHERE".$car_num. " = car_num";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
		while($row = $result->fetch_assoc()) {
			$car["Day"] = $row["Day"];
			$car["Gallons_used"] = $row["Gallons_used"];
		}
}
echo json_encode($car);
include closeDB.php
?>