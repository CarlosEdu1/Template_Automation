@Techcommerce
Feature: Aprender

  Scenario: Testar processo de compra  do TechCommerce
    Given eu acesso o site
    When coloco um produto no carrinho
    And finalizo a compra
    Then eu consigo finalizar a compra

