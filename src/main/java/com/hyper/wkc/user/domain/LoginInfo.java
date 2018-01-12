/*
    GPL(GNU Public Library) is a Library Management System.
    Copyright (C) 2018-2020  Huang Jie
    This file is part of GPL.
    GPL is a free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.hyper.wkc.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
 * 登录信息
 * @ClassName  LoginInfo
 * @author  泡面和尚
 * @date  2018年1月6日 上午3:19:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginInfo {
	
	private String phone;
	private String userid;
	private String phone_area;
	private String account_type;
	private Integer bind_pwd;
	private String nickname;

}
