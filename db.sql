-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Servidor: mysql04-farm19.uni5.net
-- Tempo de Geração: Mai 13, 2014 as 07:29 PM
-- Versão do Servidor: 5.5.24
-- Versão do PHP: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Banco de Dados: `cifali`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `Agenda`
--

CREATE TABLE IF NOT EXISTS `Agenda` (
  `Id` int(11) DEFAULT NULL,
  `IdProcedimento` int(11) DEFAULT NULL,
  `Data` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Agenda`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `Consulta`
--

CREATE TABLE IF NOT EXISTS `Consulta` (
  `Id` int(11) DEFAULT NULL,
  `IdPaciente` int(11) DEFAULT NULL,
  `IdProntuario` int(11) DEFAULT NULL,
  `IdProcedimento` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Consulta`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `Convenio`
--

CREATE TABLE IF NOT EXISTS `Convenio` (
  `Id` int(11) DEFAULT NULL,
  `IdFuncionario` int(11) DEFAULT NULL,
  `Nome` varchar(50) DEFAULT NULL,
  `Cota` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Convenio`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `Especializacao`
--

CREATE TABLE IF NOT EXISTS `Especializacao` (
  `Id` int(11) DEFAULT NULL,
  `IdFuncionario` int(11) DEFAULT NULL,
  `Nome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Especializacao`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `Exame`
--

CREATE TABLE IF NOT EXISTS `Exame` (
  `Id` int(11) DEFAULT NULL,
  `IdProntuario` int(11) DEFAULT NULL,
  `IdFuncionario` int(11) DEFAULT NULL,
  `IdEspecializacao` int(11) DEFAULT NULL,
  `Duracao` date DEFAULT NULL,
  `Descricao` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Exame`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `Funcionario`
--

CREATE TABLE IF NOT EXISTS `Funcionario` (
  `Id` int(11) DEFAULT NULL,
  `Nome` varchar(50) DEFAULT NULL,
  `Cargo` varchar(10) DEFAULT NULL,
  `Contato` text,
  `NIS` int(11) DEFAULT NULL,
  `CTPS` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Funcionario`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `Paciente`
--

CREATE TABLE IF NOT EXISTS `Paciente` (
  `Id` int(11) DEFAULT NULL,
  `Nome` varchar(50) DEFAULT NULL,
  `Idade` int(11) DEFAULT NULL,
  `Contato` text,
  `Genero` enum('F','M') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Paciente`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `Procedimento`
--

CREATE TABLE IF NOT EXISTS `Procedimento` (
  `Id` int(11) DEFAULT NULL,
  `IdProntuario` int(11) DEFAULT NULL,
  `IdFuncionario` int(11) DEFAULT NULL,
  `Procedimentos` varchar(50) DEFAULT NULL,
  `Materiais` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Procedimento`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `Prontuario`
--

CREATE TABLE IF NOT EXISTS `Prontuario` (
  `Id` int(11) DEFAULT NULL,
  `IdPaciente` int(11) DEFAULT NULL,
  `Historico` text,
  `DataCriacao` date DEFAULT NULL,
  `DataModificacao` date DEFAULT NULL,
  `TipoSanguineo` enum('A-','A+','O-','O+','B-','B+','AB-','AB+') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Prontuario`
--

