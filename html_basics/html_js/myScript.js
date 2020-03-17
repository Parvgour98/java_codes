var num1, num2;
function DoSomething(){
        num1 = parseInt(document.getElementById("first").value);
        num2 = parseInt(document.getElementById("second").value);
        console.log( num1 + num2);
        document.getElementById("here").innerHTML = num1 + " +  " 
		+ num2 + " = " + (num1 + num2);
}

function multiplyy(){
	num1 = parseInt(document.getElementById("first").value);
	num2 = parseInt(document.getElementById("second").value);
	console.log( num1 * num2);
}

function divide(){
	num1 = parseInt(document.getElementById("first").value);
	num2 = parseInt(document.getElementById("second").value);
	if(num1 == 0 || num2 == 0){
		console.log("Sorry!! No division possible");
	}else{
		console.log(num1/num2);
	}
}

function printGrade(){
	var grade = document.getElementById("grade").value;
	var result;

	//switch case
	switch(grade){
		case 'a':
		case 'A': result = "Grade: " + grade;
			break;
		case 'b':
		case 'B': result = "Grade: " + grade;
			break;
		case 'c':
		case 'C': result = "Grade: " + grade;
			break;
		default: result = "no grade";
			break;
		
	}
	console.log(result);
}

//loops
function loopingDemo() {
	// //for loop
	// for(i = 1; i< 10; i++){
	// 	console.log(i);
	// }

	var i = 1;
	// console.log("while loop");
	// while(i<10){
	// 	console.log(i);
	// 	i++;
	// }
}

function arraysDemo(){
	var id = [1,"Pallavi",true];
	id[3] = 23;

	for(i=0;i<id.length;i++){
		document.write(id[i]);
	}

	//another way to write an array
	var emp = new Array();
	emp[0] = "Pallavi";
	emp[1] = "Haripriya";

	//another way to create an array
	var names = new Array("Abby", "Jane", "Mary");
	for(i=0;i<names.length;i++){
		console.log(names[i]);
	}
	names.push("James");

	console.log("After pushing an element");
	for(i=0;i<names.length;i++){
		console.log(names[i]);
	}
}