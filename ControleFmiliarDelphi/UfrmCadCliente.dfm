object frmCadCliente: TfrmCadCliente
  Left = 192
  Top = 117
  Width = 856
  Height = 288
  Caption = 'Cadastro de Cliente'
  Color = clSilver
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  Position = poScreenCenter
  OnCloseQuery = FormCloseQuery
  OnCreate = FormCreate
  OnDestroy = FormDestroy
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 104
    Top = 8
    Width = 58
    Height = 13
    Caption = 'CLICODIGO'
    FocusControl = DBEdit1
  end
  object Label2: TLabel
    Left = 184
    Top = 8
    Width = 48
    Height = 13
    Caption = 'CLINOME'
    FocusControl = DBEdit2
  end
  object Label3: TLabel
    Left = 640
    Top = 8
    Width = 74
    Height = 13
    Caption = 'DTCADASTRO'
    FocusControl = DBEdit3
  end
  object Label4: TLabel
    Left = 744
    Top = 8
    Width = 89
    Height = 13
    Caption = 'DTATUALIZACAO'
    FocusControl = DBEdit4
  end
  object Label5: TLabel
    Left = 104
    Top = 72
    Width = 76
    Height = 13
    Caption = 'CLIENDERECO'
    FocusControl = DBEdit5
  end
  object Label6: TLabel
    Left = 640
    Top = 72
    Width = 57
    Height = 13
    Caption = 'CLIBAIRRO'
    FocusControl = DBEdit6
  end
  object Label7: TLabel
    Left = 104
    Top = 136
    Width = 56
    Height = 13
    Caption = 'CLICIDADE'
    FocusControl = DBEdit7
  end
  object Label8: TLabel
    Left = 456
    Top = 136
    Width = 30
    Height = 13
    Caption = 'CLIUF'
    FocusControl = DBEdit8
  end
  object Label9: TLabel
    Left = 504
    Top = 136
    Width = 37
    Height = 13
    Caption = 'CLICEP'
    FocusControl = DBEdit9
  end
  object Label10: TLabel
    Left = 640
    Top = 136
    Width = 42
    Height = 13
    Caption = 'CLITEL1'
    FocusControl = DBEdit10
  end
  object Label11: TLabel
    Left = 104
    Top = 200
    Width = 65
    Height = 13
    Caption = 'CLICELULAR'
    FocusControl = DBEdit11
  end
  object Label12: TLabel
    Left = 288
    Top = 200
    Width = 49
    Height = 13
    Caption = 'CLIETEL2'
    FocusControl = DBEdit12
  end
  object pnlCliente: TPanel
    Left = 0
    Top = 0
    Width = 97
    Height = 249
    TabOrder = 9
    object btnNovo: TBitBtn
      Left = 8
      Top = 8
      Width = 75
      Height = 25
      Caption = 'Novo'
      TabOrder = 0
      OnClick = btnNovoClick
    end
    object btnAlterar: TBitBtn
      Left = 8
      Top = 40
      Width = 75
      Height = 25
      Caption = 'Alterar'
      TabOrder = 1
      OnClick = btnAlterarClick
    end
    object btnCancelar: TBitBtn
      Left = 8
      Top = 72
      Width = 75
      Height = 25
      Caption = 'Cancelar'
      TabOrder = 2
      OnClick = btnCancelarClick
    end
    object btnExcluir: TBitBtn
      Left = 8
      Top = 104
      Width = 75
      Height = 25
      Caption = 'Excluir'
      TabOrder = 3
      OnClick = btnExcluirClick
    end
    object btnSalvar: TBitBtn
      Left = 8
      Top = 136
      Width = 75
      Height = 25
      Caption = 'Salvar'
      TabOrder = 4
      OnClick = btnSalvarClick
    end
    object btnSair: TBitBtn
      Left = 8
      Top = 216
      Width = 75
      Height = 25
      Caption = 'Sair'
      TabOrder = 5
      OnClick = btnSairClick
    end
    object btnLocalizar: TBitBtn
      Left = 8
      Top = 168
      Width = 75
      Height = 25
      Caption = 'Localizar'
      TabOrder = 6
    end
  end
  object DBEdit1: TDBEdit
    Left = 104
    Top = 24
    Width = 65
    Height = 21
    DataField = 'CLICODIGO'
    DataSource = dtsCadcliente
    ReadOnly = True
    TabOrder = 10
  end
  object DBEdit2: TDBEdit
    Left = 184
    Top = 24
    Width = 441
    Height = 21
    DataField = 'CLINOME'
    DataSource = dtsCadcliente
    TabOrder = 0
  end
  object DBEdit3: TDBEdit
    Left = 640
    Top = 24
    Width = 89
    Height = 21
    DataField = 'DTCADASTRO'
    DataSource = dtsCadcliente
    ReadOnly = True
    TabOrder = 12
  end
  object DBEdit4: TDBEdit
    Left = 744
    Top = 24
    Width = 97
    Height = 21
    DataField = 'DTATUALIZACAO'
    DataSource = dtsCadcliente
    ReadOnly = True
    TabOrder = 11
  end
  object DBEdit5: TDBEdit
    Left = 104
    Top = 88
    Width = 521
    Height = 21
    DataField = 'CLIENDERECO'
    DataSource = dtsCadcliente
    TabOrder = 1
  end
  object DBEdit6: TDBEdit
    Left = 640
    Top = 88
    Width = 201
    Height = 21
    DataField = 'CLIBAIRRO'
    DataSource = dtsCadcliente
    TabOrder = 2
  end
  object DBEdit7: TDBEdit
    Left = 104
    Top = 152
    Width = 337
    Height = 21
    DataField = 'CLICIDADE'
    DataSource = dtsCadcliente
    TabOrder = 3
  end
  object DBEdit8: TDBEdit
    Left = 456
    Top = 152
    Width = 33
    Height = 21
    CharCase = ecUpperCase
    DataField = 'CLIUF'
    DataSource = dtsCadcliente
    TabOrder = 4
  end
  object DBEdit9: TDBEdit
    Left = 504
    Top = 152
    Width = 121
    Height = 21
    DataField = 'CLICEP'
    DataSource = dtsCadcliente
    TabOrder = 5
  end
  object DBEdit10: TDBEdit
    Left = 640
    Top = 152
    Width = 201
    Height = 21
    DataField = 'CLITEL1'
    DataSource = dtsCadcliente
    TabOrder = 6
  end
  object DBEdit11: TDBEdit
    Left = 104
    Top = 216
    Width = 169
    Height = 21
    DataField = 'CLICELULAR'
    DataSource = dtsCadcliente
    TabOrder = 7
  end
  object DBEdit12: TDBEdit
    Left = 288
    Top = 216
    Width = 173
    Height = 21
    DataField = 'CLIETEL2'
    DataSource = dtsCadcliente
    TabOrder = 8
  end
  object dtsCadcliente: TDataSource
    DataSet = dmCliente.cdsCadCliente
    Left = 816
    Top = 224
  end
end
