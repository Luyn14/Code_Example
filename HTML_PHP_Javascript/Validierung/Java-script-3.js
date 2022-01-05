function validateTextField() {

    let select = document.querySelector('#selected');
    let selected = select.options[select.selectedIndex];
    let usedField = selected.innerHTML;
    let Field = document.querySelector('#emergency');

    if (usedField == "Bug") {
        Field.selectedIndex = 3;
        Field.disabled = true;
    } else {
        Field.selectedIndex = 0;
        Field.disabled = false;
    }

}



function validateForms(event) {
    let valid = true;
    let product = document.querySelector('#product');
    let text = document.querySelector('#text');
    let selected = document.querySelector('#selected');
    let emergency = document.querySelector('#emergency');

    if (Number(product.value) === 0) {
        valid = false;
        product.className += ' border border-danger';
    }
    if (Number(text.value) === 0) {
        valid = false;
        text.className += ' border border-danger';
    }
    if (Number(selected.value) === 0) {
        valid = false;
        selected.className += ' border border-danger';
    }
    if (Number(emergency.value) === 0) {
        valid = false;
        emergency.className += ' border border-danger';
    }

    if (!valid) {
        event.preventDefault();
    }
}
