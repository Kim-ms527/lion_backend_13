-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema lionbank
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema lionbank
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `lionbank` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema likebank
-- -----------------------------------------------------
USE `lionbank` ;

-- -----------------------------------------------------
-- Table `lionbank`.`bank`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lionbank`.`bank` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lionbank`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lionbank`.`customer` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `bank_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_customer_bank_idx` (`bank_id` ASC) VISIBLE,
  CONSTRAINT `fk_customer_bank`
    FOREIGN KEY (`bank_id`)
    REFERENCES `lionbank`.`bank` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lionbank`.`account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lionbank`.`account` (
  `id` INT NOT NULL,
  `account_number` VARCHAR(50) NOT NULL,
  `coustomer_id` INT NOT NULL,
  `balance` INT NULL DEFAULT 0,
  `bank_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `account_number_UNIQUE` (`account_number` ASC) VISIBLE,
  INDEX `fk_account_customer_idx` (`coustomer_id` ASC) VISIBLE,
  INDEX `fk_account_bank_idx` (`bank_id` ASC) VISIBLE,
  CONSTRAINT `fk_account_customer`
    FOREIGN KEY (`coustomer_id`)
    REFERENCES `lionbank`.`customer` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_account_bank`
    FOREIGN KEY (`bank_id`)
    REFERENCES `lionbank`.`bank` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
