CREATE DATABASE demoBuoi11;

USE demoBuoi11;

CREATE TABLE may_tinh(
	ma UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	ten nvarchar(100),
	gia float,
	bo_nho nvarchar(100),
	mau_sac nvarchar(100),
	hang nvarchar(100),
	mieu_ta nvarchar(100)
)
CREATE TABLE sinh_vien (
                           ma UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
                           ten VARCHAR(100) NULL,
                           tuoi BIGINT NULL,
                           dia_chi VARCHAR(100) NULL,
                           gioi_tinh BIT NULL
)