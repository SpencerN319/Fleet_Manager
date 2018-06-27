<?php
include connect.php
$car_num = $_Post["car_num"];
$sql = "SELECT Service, Desc, Date FROM service_info WHERE".$car_num. "= car_num";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
		while($row = $result->fetch_assoc()) {
			$car["Service"] = $row["Service"];
			$car["Desc"] = $row["Desc"];
			$car["Date"] = $row["Date"];
		}
}
echo json_encode($car);
include closeDB.php
?>