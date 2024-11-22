@Techcommerce
Feature: Aprender

  Scenario: Adicionar um produto ao carrinho de compras
    Given eu acesso o site
    When seleciono uma categoria
    And escolho um produto
    And adiciono no carrinho
    Then verifico se o produto foi adicionado no carrinho

  Scenario: Remover um produto do carrinho de compras
    Given acesso o site
    When seleciono a categoria de um produto
    And escolho um produto da categoria
    And adiciono no carrinho o produto
    And removo o produto do carrinho
    Then verifico se o produto foi removido do carrinho

#
#  Scenario: Fazer um cadastro de usuario no site
#    Given acesso o site tech
#    When clico na conta
#    And clico em inscrever-se
#    And informo minhas informacoes
#    Then confirmo a criacao de conta