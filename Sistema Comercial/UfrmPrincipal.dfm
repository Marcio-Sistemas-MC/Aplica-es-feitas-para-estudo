object frmPrincipal: TfrmPrincipal
  Left = 192
  Top = 117
  Width = 928
  Height = 480
  Align = alClient
  Caption = 'Sistema Comercial'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  Menu = MainMenu1
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object stbDataHora: TStatusBar
    Left = 0
    Top = 410
    Width = 920
    Height = 19
    Panels = <
      item
        Alignment = taCenter
        Width = 120
      end
      item
        Alignment = taCenter
        Width = 120
      end
      item
        Alignment = taCenter
        Width = 120
      end>
  end
  object MainMenu1: TMainMenu
    Left = 8
    object CADASTRO1: TMenuItem
      Caption = 'CADASTRO'
      object CLIENTE1: TMenuItem
        Caption = 'CLIENTE'
      end
      object FORNECEDOR1: TMenuItem
        Caption = 'FORNECEDOR'
      end
      object FUNCIONRIO1: TMenuItem
        Caption = 'FUNCION'#193'RIO'
      end
      object USURIO1: TMenuItem
        Caption = 'USU'#193'RIO'
      end
      object PRODUTO1: TMenuItem
        Caption = 'PRODUTO'
      end
      object FORMADEPAGAMENTO1: TMenuItem
        Caption = 'FORMA DE PAGAMENTO'
      end
      object CONDIESDEPAGAMENTO1: TMenuItem
        Caption = 'CONDI'#199#213'ES DE PAGAMENTO'
      end
    end
    object VENDAS1: TMenuItem
      Caption = 'VENDAS'
    end
    object COMPRAS1: TMenuItem
      Caption = 'COMPRAS'
    end
    object RELATRIOS1: TMenuItem
      Caption = 'RELAT'#211'RIOS'
    end
    object SAIR1: TMenuItem
      Caption = 'SAIR'
    end
  end
end
