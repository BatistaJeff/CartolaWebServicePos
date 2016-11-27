
DROP TABLE IF EXISTS `atletas`;
CREATE TABLE `atletas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `apelido` varchar(50) NOT NULL,
  `foto` varchar(50) NOT NULL,
  `preco_editorial` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `clubes`;
CREATE TABLE IF NOT EXISTS `cartoladb`.`clubes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `abreviacao` VARCHAR(50) NOT NULL,
  `posicao` int NOT NULL,
  `escudo` INT(11) NOT NULL,  
  INDEX `escudo` (`escudo`),
  PRIMARY KEY (`id`),
  CONSTRAINT `clubes_ibfk_1`
    FOREIGN KEY (`escudo`)
    REFERENCES `cartoladb`.`escudos` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


DROP TABLE IF EXISTS `destaques`;
CREATE TABLE IF NOT EXISTS `cartoladb`.`destaques` (
  `escalacoes` INT NOT NULL,
  `clube` VARCHAR(50) NOT NULL,
  `escudo_clube` VARCHAR(50) NOT NULL,
  `posicao` VARCHAR(50) NOT NULL,
  `atleta` INT(11) NOT NULL,  
  INDEX `atleta` (`atleta`),
  PRIMARY KEY (`escalacoes`),
  CONSTRAINT `destaques_ibfk_1`
    FOREIGN KEY (`atleta`)
    REFERENCES `cartoladb`.`atletas` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


DROP TABLE IF EXISTS `status`;
CREATE TABLE IF NOT EXISTS `cartoladb`.`status` (     

  `rodada_atual` INT NOT NULL,
  `status_mercado` INT NOT NULL,
  `esquema_default_id` INT NOT NULL,
  `cartoleta_inicial` INT NOT NULL,
  `max_ligas_free` INT NOT NULL,
  `max_ligas_pro` INT NOT NULL,
  `max_ligas_matamata_free` INT NOT NULL,
  `max_ligas_matamata_pro` INT NOT NULL,
  `max_ligas_patrocinadas_free` INT NOT NULL,
  `max_ligas_patrocinadas_pro_num` INT NOT NULL,
  `game_over` bit(1) NOT NULL,
  `times_escalados` INT NOT NULL,
  `mercado_pos_rodada` bit(1) NOT NULL,
  `aviso` VARCHAR(50) NOT NULL,
  `fechamento` INT NOT NULL,
  INDEX `fechamento` (`fechamento`),
  PRIMARY KEY (`rodada_atual`),
  CONSTRAINT `status_ibfk_1`
    FOREIGN KEY (`fechamento`)
    REFERENCES `cartoladb`.`fechamentos` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

DROP TABLE IF EXISTS `escudos`;
CREATE TABLE `escudos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tamanho_60x60` varchar(50) NOT NULL,
  `tamanho_45x45` varchar(50) NOT NULL,
  `tamanho_30x30` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `fechamentos`;
CREATE TABLE `fechamentos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dia` int(11) NOT NULL,
  `mes` int(11) NOT NULL,
  `ano` int(11) NOT NULL,
  `hora` int(11) NOT NULL,
  `minuto` int(11) NOT NULL,
  `timestamp` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;