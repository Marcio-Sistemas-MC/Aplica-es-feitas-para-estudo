object dmCliente: TdmCliente
  OldCreateOrder = False
  Left = 535
  Top = 231
  Height = 150
  Width = 215
  object sdsCadCliente: TSQLDataSet
    MaxBlobSize = -1
    ParamCheck = False
    Params = <>
    SQLConnection = dmPrincipal.sqlConsSisComercial
    Left = 16
    Top = 8
  end
end
