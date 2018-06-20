<?php
include connect.php
$car_num = $_Post["car_num"];
$sql = "SELECT Service, Desc, Data FROM service_info WHERE".$car_num. "= car_num";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
		while($row = $result->fetch_assoc()) {
			$car["service"] = $row["service"];
			$car["desc"] = $row["desc"];
			$car["data"] = $row["data"];
		}
}
echo json_encode($car);
include closeDB.php
?>