function mostrarModal(botaoClicado, modalId,location) {
    $(modalId).modal("show");
    $("#btnsim").attr("data-id", botaoClicado.attr("data-id"));
    $("#btnsim").on("click", function () {
      let botaoSim = $(this);
      let id = botaoSim.attr("data-id");
      $.ajax({
        url: location +"/remover/" + id,
        method: "Get",
        success: function () {
          window.location.href = location;
        },
      });
    });
  }

  /* Bem */
  $("#tabBem").on("click", ".js-delete", function () {
    let botaoClicado = $(this);
    mostrarModal(botaoClicado, "#modalBem","/bem");
  });

  /* Centro de Custo*/
  $("#tabCentroCusto").on("click", ".js-delete", function () {
    let botaoClicado = $(this);
    mostrarModal(botaoClicado, "#modalCentroCusto","/centroCusto");
  });
  
  /* Depreciacao */
  $("#tabdepreciacao").on("click", ".js-delete", function () {
    let botaoClicado = $(this);
    mostrarModal(botaoClicado, "#modaldepreciacao","/depreciacao");
  });

  /* Imovel */
  $("#tabimovel").on("click", ".js-delete", function () {
    let botaoClicado = $(this);
    mostrarModal(botaoClicado, "#modalimovel","/imovel");
  });

  /* Info Fiscal */
  $("#tabinfoFiscal").on("click", ".js-delete", function () {
    let botaoClicado = $(this);
    mostrarModal(botaoClicado, "#modalinfoFiscal","/infoFiscal");
  });

  /* Item */
  $("#tabitem").on("click", ".js-delete", function () {
    let botaoClicado = $(this);
    mostrarModal(botaoClicado, "#modalitem","/item");
  });

  /* Marca */
  $("#tabmarca").on("click", ".js-delete", function () {
    let botaoClicado = $(this);
    mostrarModal(botaoClicado, "#modalmarca","/marca");
  });

  /* Movel */
  $("#tabmovel").on("click", ".js-delete", function () {
    let botaoClicado = $(this);
    mostrarModal(botaoClicado, "#modalmovel","/movel");
  });

  /* Movimentacao */
  $("#tabmovimentacao").on("click", ".js-delete", function () {
    let botaoClicado = $(this);
    mostrarModal(botaoClicado, "#modalmovimentacao","/movimentacao");
  });