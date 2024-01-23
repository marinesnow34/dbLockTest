package com.test.db;

import org.springframework.stereotype.Service;

import com.test.db.model.CouponRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {
	private final CouponRepository couponRepository;
	public void nomal() {
	}
}
