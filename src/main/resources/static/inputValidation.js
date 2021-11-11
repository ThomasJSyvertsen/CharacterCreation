/**
 * 
 */

function checkForm() {
	let form = document.forms["myForm"];
	if (form.playerName.value == "") {
		alert("Player Name must be filled out");
		return false;
	}
	
	return true;
}