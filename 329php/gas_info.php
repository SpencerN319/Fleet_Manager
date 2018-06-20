<?php
include connect.php
$car_num = $_Post["car_num"];
$sql = "SELECT day, gallons_used FROM gas_info WHERE".$car_num. " = car_num";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
		while($row = $result->fetch_assoc()) {
			$car["day"] = $row["day"];
			$car["gallons_used"] = $row["gallons_used"];
		}
}
echo json_encode($car);
include closeDB.php
?>