document.addEventListener('DOMContentLoaded', function() {
    const cepInput = document.getElementById('cep');
    const addressInput = document.getElementById('address');
    const neighborhoodInput = document.getElementById('neighborhood');
    const cityInput = document.getElementById('city');
    const stateInput = document.getElementById('state');

    cepInput.addEventListener('blur', function() {
        const cep = cepInput.value.replace(/\D/g, '');

        if (cep.length === 8) {
            fetch(`https://viacep.com.br/ws/${cep}/json/`)
                .then(response => response.json())
                .then(data => {
                    if (!data.erro) {
                        addressInput.value = data.logradouro;
                        neighborhoodInput.value = data.bairro;
                        cityInput.value = data.localidade;
                        stateInput.value = data.uf;
                    } else {
                        alert('CEP não encontrado.');
                        clearAddressFields();
                    }
                })
                .catch(error => {
                    console.error('Erro ao buscar o CEP:', error);
                    alert('Erro ao buscar o CEP. Tente novamente.');
                    clearAddressFields();
                });
        } else {
            alert('CEP inválido. Deve conter 8 dígitos.');
            clearAddressFields();
        }
    });

    function clearAddressFields() {
        addressInput.value = '';
        neighborhoodInput.value = '';
        cityInput.value = '';
        stateInput.value = '';
    }
});