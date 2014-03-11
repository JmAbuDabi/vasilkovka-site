<?php

include ("lib/openapi.php");
$vk = new Auth_Vkontakte();
$vk_auth = $vk->is_auth();
$vk_mid = $vk->get_mid();
include ("templates/index.html");
?>
